package com.local.java8.newinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class SearchUsingLabmda {

	public SearchUsingLabmda() {
		// TODO Auto-generated constructor stub
	}

	static List<Member> listFiltered = new ArrayList<Member>();
	private static final Map<String, Predicate<Member>> searchMap = new HashMap<>();

	public static void main(String... args) {
		List<Member> members = new ArrayList<Member>();
		List<String> roles1 = new ArrayList<String>();
		roles1.add("secure_user");
		roles1.add("io_admin");

		List<String> roles2 = new ArrayList<String>();
		roles2.add("secure_user");
		roles2.add("forms_admin");

		getFilter("primary_owner", "secure_user");

		for (int i = 0; i < 20000; i++) {
			members.add(new Member("shitla", "mishra", "primary_owner", roles1,
					"ssd", "wrq"));
			members.add(new Member("shitla", "mishra", "secondary_owner",
					roles2, "sqwrr", "rqrq"));
			// members.add(new Member.Builder().);
		}

		members.add(new Member("manohar", "secondary_owner", roles2));
		System.out.println("Print numbers greater than 5:");
		/*evaluate(members,
				(m) -> m.getMemberType().equalsIgnoreCase("primary_owner")
						&& m.getRoles().containsAll(roles1)
						&& (m.getName().startsWith("shitl")
								|| m.getLastName().startsWith("shitl")
								|| m.getSso().startsWith("shitl") || m
								.getEmail().startsWith("shitl")));*/
		members.stream().filter(searchMap.get("memberTypeFilter"))
				.forEach(Member::printEasternName);
	}

	public static void evaluate(List<Member> list, Predicate<Member> predicate) {
		for (Member m : list) {
			if (predicate.test(m)) {
				//System.out.println(m + " " + m.getName());
				listFiltered.add(m);
			}
		}
	}

	public static void getFilter(String... args) {
		
		if ("all".equalsIgnoreCase("member_type")) {
			if ("all".equalsIgnoreCase("member_type")) {
				// just chek content
			} else {
				// check search content + role
			}
		} else {
			if ("y" == "all") {
				// check for type + content
			} else {
				// check for type + role + content
			}

		}	
		
		Predicate<Member> memberTypeFilter = p -> p.getMemberType().equals(
				args[0])
				&& (p.getName().startsWith("shitl")
						|| p.getLastName().startsWith("shitl")
						|| p.getSso().startsWith("shitl") || p.getEmail()
						.startsWith("shitl"));
		Predicate<Member> roleTypeFilter = p -> p.getRoles().containsAll(
				new ArrayList())
				&& (p.getName().startsWith("shitl")
						|| p.getLastName().startsWith("shitl")
						|| p.getSso().startsWith("shitl") || p.getEmail()
						.startsWith("shitl"));
		Predicate<Member> memberAndRoleTypeFilter = p -> p.getMemberType()
				.equals(args[0])
				&& p.getRoles().containsAll(new ArrayList())
				&& (p.getName().startsWith("shitl")
						|| p.getLastName().startsWith("shitl")
						|| p.getSso().startsWith("shitl") || p.getEmail()
						.startsWith("shitl"));
		Predicate<Member> withoutFilter = p -> (p.getName().startsWith("shitl")
				|| p.getLastName().startsWith("shitl")
				|| p.getSso().startsWith("shitl") || p.getEmail().startsWith(
				"shitl"));
		searchMap.put("memberTypeFilter", memberTypeFilter);
		searchMap.put("roleTypeFilter", roleTypeFilter);
		searchMap.put("memberAndRoleTypeFilter", memberAndRoleTypeFilter);
		searchMap.put("withoutFilter", withoutFilter);

	}

}
