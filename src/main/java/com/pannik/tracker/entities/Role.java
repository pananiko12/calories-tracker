package com.pannik.tracker.entities;

import javax.persistence.*;



@Entity
@Table(name="roles")
public class Role {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer rid;
		
		@Enumerated(EnumType.STRING)
		private ERole rname;

		public Role() {
		
		}

		public Integer getRid() {
			return rid;
		}

		public void setRid(Integer rid) {
			this.rid = rid;
		}

		public ERole getRname() {
			return rname;
		}

		public void setRname(ERole rname) {
			this.rname = rname;
		}
		
		
}
